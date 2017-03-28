//package com.udr013.discogs_rest_client.services.server;
//
//import com.udr013.discogs_rest_client.entities.CdbUser;
//import com.udr013.discogs_rest_client.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Collection;
//
//@Service
//@Transactional
//public class UserService {
//
//    @Autowired
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    private UserRepository userRepository;
//
//    public CdbUser saveUser(CdbUser user) {
//         return userRepository.save(user);
//    }
//
//
//    public Boolean deleteUser(Long id) {
//        CdbUser temp = userRepository.findOne(id);
//       if(temp!=null){
//           userRepository.delete(id);
//           return true;
//       }
//        return false;
//    }
//
//
//    public CdbUser editUser(CdbUser user) {
//        return userRepository.save(user);
//    }
//
//    public CdbUser findUser(Long id) {
//        return userRepository.findOne(id);
//    }
//
//    public Collection<CdbUser> getAllUsers() {
//        return (Collection<CdbUser>) userRepository.findAll();
//    }
//
//    public CdbUser findByName(String name) {
//        return userRepository.findByUsername(name);
//    }
//
//    public CdbUser findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }
////
////    @Override
////    public Collection<User> findByName(String name) {
////        return (Collection<User>) userRepository.findByName(name);
////    }
//}
