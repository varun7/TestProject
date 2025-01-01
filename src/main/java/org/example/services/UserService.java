package org.example.services;

import org.example.repository.EmployeeEntity;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUsernameById(Long id) {
        EmployeeEntity employee = userRepository.getFirstById(id);
        return employee.getName();
    }
}
