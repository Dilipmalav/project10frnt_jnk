import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-position',
  templateUrl: './position.component.html',
  styleUrls: ['./position.component.css']
})
export class PositionComponent extends BaseCtl{

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
     super(locator.endpoints.POSITION, locator, route);
   }
   validate() {
     return this.validateForm(this.form.data);
   }
   validateForm(form) {
     let flag = true;
     let validator = this.serviceLocator.dataValidator;
     flag = flag && validator.isNotNullObject(form.designation);
     flag = flag && validator.isNotNullObject(form.openingDate);
     flag = flag && validator.isNotNullObject(form.requiredExperience);
     flag = flag && validator.isNotNullObject(form.conditionName);
     return flag;
   }
 
   populateForm(form, data) {
     form.id = data.id;
     form.name = data.designation;
     form.dateOfVisit = data.openingDate;
     form.mobile = data.requiredExperience;
     form.decease = data.conditionName;
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
