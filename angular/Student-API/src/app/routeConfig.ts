import { Routes } from "@angular/router";

import { StudentDetailsComponent } from "./student-details/student-details.component";
import { AddNewStudentComponent } from "./add-new-student/add-new-student.component";
import { UpdateFormComponent } from "./update-form/update-form.component";
// import { PageNotFoundComponent } from "./page-not-found/page-not-found.component";

export const routeArgs: Routes = [
    { path: 'home', component: StudentDetailsComponent },
    { path: 'addStudent', component: AddNewStudentComponent },
    { path: 'updateStudent', component: UpdateFormComponent },
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    // { path: '**', component: PageNotFoundComponent},
]