package pro.sky.API.SwaggerUI.Postman.Service;

import pro.sky.API.SwaggerUI.Postman.Model.Student;

public interface StudentService {
    Student addStudent(Student student);

    Student findStudent(long id);

    Student editStudent(long id, Student student);

    void deleteStudent(long id);
}
