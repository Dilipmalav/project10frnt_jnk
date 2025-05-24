import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent extends BaseCtl{

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
     super(locator.endpoints.PATIENT, locator, route);
   }
   validate() {
     return this.validateForm(this.form.data);
   }
   validateForm(form) {
     let flag = true;
     let validator = this.serviceLocator.dataValidator;
     flag = flag && validator.isNotNullObject(form.name);
     flag = flag && validator.isNotNullObject(form.dateOfVisit);
     flag = flag && validator.isNotNullObject(form.mobile);
     flag = flag && validator.isNotNullObject(form.decease);
     return flag;
   }
 
   populateForm(form, data) {
     form.id = data.id;
     form.name = data.name;
     form.dateOfVisit = data.dateOfVisit;
     form.mobile = data.mobile;
     form.decease = data.decease;
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