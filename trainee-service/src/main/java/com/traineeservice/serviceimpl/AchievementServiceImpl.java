package com.traineeservice.serviceimpl;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.traineeservice.bean.AchievementBean;
import com.traineeservice.bean.ResponseDto;
import com.traineeservice.bean.UserBean;
import com.traineeservice.entity.Achievement;
import com.traineeservice.exception.NoSuchRecordFoundException;
import com.traineeservice.repository.AchievementRepository;
import com.traineeservice.service.AchievementService;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class AchievementServiceImpl implements AchievementService {
//	public static Logger log = LoggerFactory.getLogger(Achievement.class.getSimpleName());
	
	@Autowired

	private AchievementRepository achievementRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private AchievementBean maptoAchievement(Achievement achievement)
	{
		AchievementBean achievementBean=new AchievementBean();
		achievementBean.setId(achievement.getId());
		achievementBean.setAchievementType(achievement.getAchievementType());
		achievementBean.setDateCompleted(achievement.getDateCompleted());
		achievementBean.setDescription(achievement.getDescription());
		achievementBean.setUserId(achievement.getUserId());
		return achievementBean;
	}
	
	public ResponseDto getAchievement(Long id)
	{
		ResponseDto responseDto=new ResponseDto();
		Achievement achievement=achievementRepository.findById(id).get();
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		AchievementBean achievementBean=maptoAchievement(achievement);
		HttpEntity<String> httpEntity=new HttpEntity<String>(headers);
		ResponseEntity<UserBean> responseEntity=restTemplate.exchange("http://localhost:8081/user/getById/"+
		          achievement.getUserId(),HttpMethod.GET,httpEntity,UserBean.class);
		UserBean userBean=responseEntity.getBody();
		responseDto.setAchievementBean(achievementBean);
		responseDto.setUserBean(userBean);
		return responseDto;

	}
	
	@Override
	public Achievement saveAchievement(Achievement achievement) {
		return achievementRepository.save(achievement);
	}

//	@Override
//	public void save(Achievement achievement) {
//		achievementRepository.save(achievement);
//		log.info("achievement details saved ", achievement);
//		log.info("achievement details saved ", achievement);
//	
//	}
//
//	@Override
//	public Achievement get(Long id) {
//
//		Optional<Achievement> optional = achievementRepository.findById(id);
//		if (optional.isEmpty()) {
//			try {
//				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));
//			} catch (NoSuchRecordFoundException e) {
//				throw e;
//			}
//		}
//		System.out.println("fetched successfully");
//		return optional.get();
//
//	}
//
//	@Override
//	public List<Achievement> getAll() {
//
//		return achievementRepository.findAll();
//	}
//
//	@Override
//	public String deleteById(Long id) {
//		Optional<Achievement> optional = achievementRepository.findById(id);
//		if (optional.isEmpty()) {
//			try {
//				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));
//			} catch (NoSuchRecordFoundException e) {
//				throw e;
//			}
//
//		} else {
//			achievementRepository.deleteById(id);
//
//		}
//
//		return "deleted";
//	}
//
//	@Override
//	public void deleteAll() {
//		achievementRepository.deleteAll();
//	}
//
//	@Override
//	public Achievement update(Achievement achievement) {
//
//		Optional<Achievement> optional = achievementRepository.findById(achievement.getId());
//		if (optional.isEmpty()) {
//			try {
//				optional.orElseThrow(() -> new NoSuchRecordFoundException("Provide correct details "));
//
//			} catch (NoSuchRecordFoundException e) {
//				throw e;
//			}
//		} else {
//			achievementRepository.save(achievement);
//
//		}
//		return achievement;
//	}

}
