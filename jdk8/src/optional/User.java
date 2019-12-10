package optional;

import java.util.Optional;

public class User {

	private String name, id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{" +
				"\"name\":\"" + name + '\"' +
				", \"id\":\"" + id + '\"' +
				'}';
	}

	public User(String name, String id) {
		this.name = name;
		this.id = id;
	}

	/*public static void main(String[] args) {
		User user = new User();
		User nullUser = null;
		Optional<User> userOpt = Optional.ofNullable(user);
//		Optional<User> nullUserOpt = Optional.ofNullable(nullUser);
//		System.out.println(userOpt.get());
//		System.out.println(nullUserOpt.get());

//		System.out.println(userOpt.isPresent());
//		System.out.println(nullUserOpt.isPresent());

//		userOpt.ifPresent(item -> System.out.println(item));
//		nullUserOpt.ifPresent(item -> System.out.println(item));
*//*		Optional<User> optional = nullUserOpt.filter((User item) -> item == null);
		System.out.println(optional.isPresent());
		Optional<User> opt1 = userOpt.filter((User item) -> item == null);
		System.out.println(opt1.isPresent());
		Optional<User> opt2 = userOpt.filter((User item) -> item != null);
		System.out.println(opt2.get());*//*

//		user.setId("123");
//		Optional<String> idOpt = userOpt.map(User::getId);
//		System.out.println(idOpt.get());
//		user.setId("123");
//		Optional<String> idOpt = userOpt.flatMap(item -> Optional.ofNullable(item.getId()));
//		System.out.println(idOpt.get());

//		User user1 = nullUserOpt.orElse(user);
//		System.out.println(user1);

//		User user1 = nullUserOpt.orElseGet(userOpt::get);
//		System.out.println(user1);

//		try {
//			nullUserOpt.orElseThrow(Exception::new);
//		}catch (Exception e){
//			System.err.println(e);
//		}
		boolean equals = userOpt.equals(Optional.ofNullable(user));
		System.out.println(equals);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}*/
}
