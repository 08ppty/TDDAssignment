package com.app.Tdd.Assignment;



	
	
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class TestUser {

		// we want to develop a username field which will take valid input from user

		@Test
		public void UserTest() {

			User obj = new User();

			String username = "adminuser";
			String username1 = "admin/user"; // a username should not have /
			String username2 = "admin#user"; // a username should not have #
			String username3 = "admin123";

			Assert.assertTrue(obj.isvalidUsername(username));
			Assert.assertFalse(obj.isvalidUsername(username1), "This is not valid format for username");
			Assert.assertFalse(obj.isvalidUsername(username2), "This is not valid format for username");
			Assert.assertTrue(obj.isvalidUsername(username3), "Username is not alphanumeric");

		}

	}
	
