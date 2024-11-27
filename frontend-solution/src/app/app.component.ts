import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TestService } from './test.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule, FormsModule, CommonModule],
  providers: [TestService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  apiValue: any = null;
  title = 'frontend-solution';

  constructor(private testService: TestService) { }

  ngOnInit(): void {
    this.testService.test().subscribe({
      next: (value) => {
        this.apiValue = value;
        console.log(value);
      }
    });
  }
}
