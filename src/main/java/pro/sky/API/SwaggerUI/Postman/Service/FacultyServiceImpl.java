package pro.sky.API.SwaggerUI.Postman.Service;

import org.springframework.stereotype.Service;
import pro.sky.API.SwaggerUI.Postman.Model.Faculty;

import java.util.HashMap;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final HashMap<Long, Faculty> faculties = new HashMap<>();
    private long count = 0;

    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    public Faculty findFaculty(long id) {
        return faculties.get(id);
    }

    public Faculty editFaculty(long id, Faculty faculty) {
        if (!faculties.containsKey(id)) {
            return null;
        }
        faculties.put(id, faculty);
        return faculty;
    }

    public void deleteFaculty(long id) {
        faculties.remove(id);
    }

}
