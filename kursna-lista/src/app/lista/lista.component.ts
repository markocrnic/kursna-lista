import { Component, OnInit } from '@angular/core';
import { HttpcallService } from '../httpcall.service';
import { NgxSpinnerService } from 'ngx-spinner';
import { trigger, style, animate, transition } from '@angular/animations';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
  animations: [
    trigger('fade', [
      transition('void => *', [
        style({ opacity: 0, transform: 'translateY(60px)' }),
        animate(900, style({opacity: 1, transform: 'translateY(0px)'}))
      ])
    ])
  ]
})
export class ListaComponent implements OnInit {


  rendered = false;
  listData = [];
  constructor(private httpService: HttpcallService, private spinner: NgxSpinnerService) { }

  ngOnInit(): void {
    this.spinner.show();
    this.httpService.callList().subscribe(
      (data) => {
        this.listData = data.currencies;
        this.rendered = true;
        this.spinner.hide();
      },
      err => {
        console.log(err);
        this.spinner.hide();
      }
    );
  }

}
