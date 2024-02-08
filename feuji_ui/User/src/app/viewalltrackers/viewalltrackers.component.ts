import { Component } from '@angular/core';

@Component({
  selector: 'app-viewalltrackers',
 
  templateUrl: './viewalltrackers.component.html',
  styleUrl: './viewalltrackers.component.css'
})
export class ViewalltrackersComponent {
  SleepAlert() {
    alert('Sleep Tracker Details: ...'); // Customize the alert message
  }

  MedAlert() {
    alert('Medicine Tracker Details: ...'); // Customize the alert message
  }
  HandAlert() {
    alert('Handwash Tracker  Details: ...'); // Customize the alert message
  }
  HeartAlert() {
    alert('Heart Rtae Tracker Details: ...'); // Customize the alert message
  }
  ResAlert() {
    alert('Respiratory Tracker Details: ...'); // Customize the alert message
  }
}
