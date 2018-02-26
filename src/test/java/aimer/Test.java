package aimer;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.connoryu.entity.User;
import com.connoryu.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext.xml" })
public class Test {
	@Autowired
	private UserService userService;

	@org.junit.Test
	public void test1() {
		User user = userService.getUserByUsername("ggg");
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

	@org.junit.Test
	public void test2() {
		String s = "abc";
		int length = s.length();
		StringBuffer result = new StringBuffer(length);
		for (int i = length - 1; i >= 0; i--) {
			result.append(s.charAt(i));
			System.out.println(result.toString());
		}
		System.out.println(result.toString());
	}

	@org.junit.Test
	public void test3() {
		int i = 2 << 2;
		System.out.println(i);
	}

	@org.junit.Test
	public void bigAndSmall() {
		int arr[] = { -5, 29, 7, 10, 5, 16 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
