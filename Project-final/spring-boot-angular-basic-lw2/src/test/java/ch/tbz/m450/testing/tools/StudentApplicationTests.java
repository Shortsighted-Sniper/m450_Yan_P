package ch.tbz.m450.testing.tools;

import ch.tbz.m450.testing.tools.controller.StudentController;
import ch.tbz.m450.testing.tools.repository.StudentRepository;
import ch.tbz.m450.testing.tools.repository.entities.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class StudentApplicationTests {

	private MockMvc mockMvc;

	@Mock
	private StudentRepository studentRepository;

	@InjectMocks
	private StudentController studentController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
	}

	@Test
	void getAllStudents_ShouldReturnListOfStudents() throws Exception {
		// Arrange
		when(studentRepository.findAll()).thenReturn(Arrays.asList(
				new Student(1L, "John Doe", "john.doe@example.com"),
				new Student(1L, "Jane Doe", "jane.doe@example.com")
		));

		// Act & Assert
		mockMvc.perform(get("/students")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$[0].name").value("John Doe"))
				.andExpect(jsonPath("$[1].name").value("Jane Doe"));

		verify(studentRepository, times(1)).findAll();
	}

	@Test
	void getStudentById_ShouldReturnStudent_WhenFound() throws Exception {
		// Arrange
		when(studentRepository.findById(1L)).thenReturn(Optional.of(new Student(1L, "John Doe", "john.doe@example.com")));

		// Act & Assert
		mockMvc.perform(get("/students/1")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.name").value("John Doe"));

		verify(studentRepository, times(1)).findById(1L);
	}

	@Test
	void getStudentById_ShouldReturnNotFound_WhenNotFound() throws Exception {
		// Arrange
		when(studentRepository.findById(1L)).thenReturn(Optional.empty());

		// Act & Assert
		mockMvc.perform(get("/students/1")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());

		verify(studentRepository, times(1)).findById(1L);
	}

	@Test
	void createStudent_ShouldSaveStudent() throws Exception {
		// Arrange
		Student student = new Student(1L, "John Doe", "john.doe@example.com");
		when(studentRepository.save(any(Student.class))).thenReturn(new Student(1L, "John Doe", "john.doe@example.com"));

		// Act & Assert
		mockMvc.perform(post("/students")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}"))
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.id").value(1));

		verify(studentRepository, times(1)).save(any(Student.class));
	}

	@Test
	void deleteStudent_ShouldRemoveStudent() throws Exception {
		// Act & Assert
		mockMvc.perform(delete("/students/1")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNoContent());

		verify(studentRepository, times(1)).deleteById(1L);
	}
}
