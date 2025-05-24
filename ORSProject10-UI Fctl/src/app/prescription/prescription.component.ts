import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-prescription',
  templateUrl: './prescription.component.html',
  styleUrls: ['./prescription.component.css']
})
export class PrescriptionComponent extends BaseCtl{

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
     super(locator.endpoints.PRESCRIPTION, locator, route);
   }
   validate() {
     return this.validateForm(this.form.data);
   }
   validateForm(form) {
     let flag = true;
     let validator = this.serviceLocator.dataValidator;
     flag = flag && validator.isNotNullObject(form.name);
     flag = flag && validator.isNotNullObject(form.date);
     flag = flag && validator.isNotNullObject(form.decease);
     flag = flag && validator.isNotNullObject(form.capacity);
     return flag;
   }
 
   populateForm(form, data) {
     form.id = data.id;
     form.name = data.name;
     form.date = data.date;
     form.decease = data.decease;
     form.capacity = data.capacity;
     form.status = data.status;
   }
    parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
  test() {

  }

}