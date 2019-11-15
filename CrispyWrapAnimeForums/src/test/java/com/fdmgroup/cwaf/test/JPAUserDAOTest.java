package com.fdmgroup.cwaf.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.cwaf.JPAMemberDAO;
import com.fdmgroup.cwaf.Member;
import com.fdmgroup.cwaf.MemberDAO;

public class JPAUserDAOTest {
	private MemberDAO classUnderTest = new JPAMemberDAO();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	Member user = new Member();
	Member user1 = new Member();
	Member memberToAdd = new Member();

	@Test
	public void testIfMemberDAOCanAddUpdateAndRemoveUsersFromDatabase() {
		Member member = classUnderTest.getMember(memberToAdd.getUsername());
		assertNull(member);
		
		memberToAdd.setUsername("someUser");
		
		classUnderTest.addMember(memberToAdd);
		member = classUnderTest.getMember(memberToAdd.getUsername());
		assertEquals(memberToAdd, member);
		
		memberToAdd.setUsername("someUsername");
		memberToAdd.setPassword("somePassword");
		memberToAdd.setEmail("someEmail");
		memberToAdd.setFirstName("memberFirstName");
		memberToAdd.setLastName("memberLastName");
		
		classUnderTest.updateMember(memberToAdd);
		member = classUnderTest.getMember(memberToAdd.getUsername());
		assertEquals(memberToAdd, member);
		
		
		
		

	}

}
