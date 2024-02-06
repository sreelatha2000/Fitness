package com.traineeservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
private AchievementBean achievementBean;
private UserBean userBean;

//public void setAchievement(AchievementBean achievementBean)
//{
//	this.achievementBean=achievementBean;
//}
//
//public void setUserBean(UserBean userBean)
//{
//	this.userBean=userBean;
//}
//
//public UserBean getUserBean()
//{
//	return userBean;
//}
//
//public void setAchievementBean(AchievementBean achievementBean)
//{
//	this.achievementBean=achievementBean;	
//}
//public AchievementBean getAchievementBean()
//{
//	return achievementBean;
//}


}
