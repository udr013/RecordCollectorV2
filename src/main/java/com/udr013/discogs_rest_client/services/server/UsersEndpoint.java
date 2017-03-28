//package com.udr013.discogs_rest_client.services.server;
//
//
//import com.udr013.discogs_rest_client.entities.CdbUser;
//import com.udr013.discogs_rest_client.repositories.UserRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping(value = "api/users", produces = "application/json", consumes = "application/json")
//public class UsersEndpoint {
//
//	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
//
//	private final UserRepository userRepository;
//
//	@Autowired
//	public UsersEndpoint(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//
////	@GetMapping
////	public ResponseEntity<Iterable<CdbUser>> allUsers(){
////		Iterable<CdbUser> allUsers = userRepository.findAll();
////		return ResponseEntity.ok(allUsers);
////	}
//
//
//	@GetMapping
//	public ResponseEntity<CdbUser> getUser(@RequestParam("{userid}") long id) {
//		System.out.println(id);
//		CdbUser user = userRepository.findOne(id);
//		LOGGER.info("found user" + user);
//		if (user == null) {
//			CdbUser dummyCdbUser = new CdbUser();
//			dummyCdbUser.setFirstName("Dummy");
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dummyCdbUser);
//		}
//
//		return ResponseEntity.ok(user);
//	}
//
//	@PostMapping
//	public ResponseEntity<CdbUser> saveUser(@RequestBody CdbUser user) {
//		final UserRepository userRepository = this.userRepository;
//		CdbUser newUser = userRepository.save(user);
//		LOGGER.info("saved user: " + newUser);
//		return ResponseEntity.ok(newUser);
//	}
//
//	@PutMapping
//	public ResponseEntity<CdbUser> updateUser(@RequestBody CdbUser user) {
//		CdbUser existingUser = userRepository.findOne(user.getId());
//		if (existingUser.getId() == 0) {
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//		}
//		userRepository.save(user);
//		return ResponseEntity.ok(existingUser);
//	}
//
//
//	@DeleteMapping("/{userid}")
//	public ResponseEntity<String> deleteUser(@PathVariable("{userid}") long id) {
//		userRepository.delete(id);
//		return ResponseEntity.ok("user deleted");
//	}
//
//}