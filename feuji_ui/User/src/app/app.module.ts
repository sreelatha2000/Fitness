import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { VerticalnavComponent } from './verticalnav/verticalnav.component';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { HomenavComponent } from './homenav/homenav.component';
import { StoreComponent } from './store/store.component';
import { MoreComponent } from './more/more.component';
import { PlansComponent } from './plans/plans.component';
import { BurnComponent } from './burn/burn.component';
import { DrinkwaterComponent } from './drinkwater/drinkwater.component';
import { FitnessStoreComponent } from './fitness-store/fitness-store.component';
import { GoalsAndBudgetsComponent } from './goals-and-budgets/goals-and-budgets.component';
import { HealthLogsComponent } from './health-logs/health-logs.component';
import { HelpAndSupportComponent } from './help-and-support/help-and-support.component';
import { InviteComponent } from './invite/invite.component';
import { ProgressReportsComponent } from './progress-reports/progress-reports.component';
import { RemindersComponent } from './reminders/reminders.component';
import { SettingsComponent } from './settings/settings.component';
import { TasksAndLeaderboardComponent } from './tasks-and-leaderboard/tasks-and-leaderboard.component';

import { UpgradeComponent } from './upgrade/upgrade.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { TrackStepsComponent } from './tracksteps/tracksteps.component';


import { ViewalltrackersComponent } from './viewalltrackers/viewalltrackers.component';




@NgModule({
  declarations: [
   
   AppComponent,
   VerticalnavComponent,
   HomenavComponent,
   StoreComponent,
   MoreComponent,
   PlansComponent,
   BurnComponent,
   DrinkwaterComponent,
   FitnessStoreComponent,
   GoalsAndBudgetsComponent,
   HealthLogsComponent,
   HelpAndSupportComponent,
   InviteComponent,
   ProgressReportsComponent,
   RemindersComponent,
   SettingsComponent,
   TasksAndLeaderboardComponent,
   TrackStepsComponent,
   UpgradeComponent,
   UserProfileComponent,
   
   
   ViewalltrackersComponent
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule,
    FormsModule,
    
   
    
  ],
  providers: [],
  bootstrap: [VerticalnavComponent],
})
export class AppModule { }
