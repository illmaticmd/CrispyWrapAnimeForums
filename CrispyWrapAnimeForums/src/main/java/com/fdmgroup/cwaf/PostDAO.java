package com.fdmgroup.cwaf;

import java.util.List;

public interface PostDAO {
	void addPost(Post post);

	Post getPost(String title);

	void removePost(String title);

	void updatePost (Post post);

	List<Post> listPost();
}
