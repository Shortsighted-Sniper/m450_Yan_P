// Sample Angular Unit Test for a Component
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { StudentListComponent } from './student-list.component';
import { StudentService } from '../services/student.service';

// Mock data
const mockStudents = [
  { id: 1, name: 'John Doe', email: 'john.doe@example.com' },
  { id: 2, name: 'Jane Doe', email: 'jane.doe@example.com' },
];

describe('StudentListComponent', () => {
  let component: StudentListComponent;
  let fixture: ComponentFixture<StudentListComponent>;
  let httpMock: HttpTestingController;
  let studentService: StudentService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [StudentListComponent],
      imports: [HttpClientTestingModule],
      providers: [StudentService]
    }).compileComponents();

    fixture = TestBed.createComponent(StudentListComponent);
    component = fixture.componentInstance;
    studentService = TestBed.inject(StudentService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should fetch and display students', () => {
    // Trigger data load
    component.ngOnInit();

    // Mock the backend response
    const req = httpMock.expectOne('/api/students');
    expect(req.request.method).toBe('GET');
    req.flush(mockStudents);

    // Verify the data is rendered
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelectorAll('.student-item').length).toBe(2);
    expect(compiled.querySelector('.student-item').textContent).toContain('John Doe');
  });

  afterEach(() => {
    httpMock.verify();
  });
});
