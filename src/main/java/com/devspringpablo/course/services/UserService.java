package com.devspringpablo.course.services;

import com.devspringpablo.course.entities.User;
import com.devspringpablo.course.repositories.UserRepository;
import com.devspringpablo.course.services.exceptions.DatabaseException;
import com.devspringpablo.course.services.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new ResourceNotFoundException(id);  // Lança a exceção se o usuário não for encontrado
            }
            repository.deleteById(id);  // Realiza a exclusão do usuário
        } catch (ResourceNotFoundException e) {
            throw e;  // Lança a exceção de recurso não encontrado
        } catch (DataIntegrityViolationException e) {
            // Lança a exceção de banco de dados com a mensagem, sem passar o "e" (erro original)
            throw new DatabaseException("Cannot delete user due to integrity constraint");
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error while deleting the user", e);  //
        }
    }

    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
