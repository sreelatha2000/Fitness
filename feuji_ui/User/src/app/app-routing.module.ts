import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomenavComponent } from './homenav/homenav.component';
import { PlansComponent } from './plans/plans.component';
import { StoreComponent } from './store/store.component';

import { BurnComponent } from './burn/burn.component';
// app-routing.module.ts
import { TrackStepsComponent} from './tracksteps/tracksteps.component';




import { DrinkwaterComponent } from './drinkwater/drinkwater.component';
import { FitnessStoreComponent } from './fitness-store/fitness-store.component';
import { HealthLogsComponent } from './health-logs/health-logs.component';
import { ProgressReportsComponent } from './progress-reports/progress-reports.component';
import { RemindersComponent } from './reminders/reminders.component';
import { HelpAndSupportComponent } from './help-and-support/help-and-support.component';
import { SettingsComponent } from './settings/settings.component';
import { MoreComponent } from './more/more.component';


import { ViewalltrackersComponent } from './viewalltrackers/viewalltrackers.component';




const routes: Routes = [
  {
    path:'home',component:HomenavComponent
  },
  {
    path:'plans',component:PlansComponent
  },
  {
    path:'store',component:StoreComponent
  },
  {
    path:'more',component:MoreComponent
  },
 
  
  {
   path:"",redirectTo:'home',pathMatch:'full'
  },

  { path: 'burn', component: BurnComponent },
  { path: 'track-steps', component: TrackStepsComponent }, // Create TrackStepsComponent and other tracker components
  { path: 'drink-water', component: DrinkwaterComponent },
  { path: 'view-all', component:  ViewalltrackersComponent},
  // Add more routes as needed
  { path: '', redirectTo: '/burn', pathMatch: 'full' }, // Default route
  
  

 
  
    { path: 'fitness-store', component: FitnessStoreComponent },
    { path: 'health-logs', component: HealthLogsComponent },
    { path: 'progress-reports', component: ProgressReportsComponent },
    { path: 'reminders', component: RemindersComponent },
    { path: 'help-support', component: HelpAndSupportComponent },
    { path: 'settings', component: SettingsComponent },
    { path: '**', redirectTo: 'fitness-store', pathMatch: 'full' },
    { path: '', component: TrackStepsComponent },
   
    
  
 
  
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
