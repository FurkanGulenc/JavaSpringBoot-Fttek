package com.springpractium.dao;

import java.sql.Date;
import java.util.List;

import com.springpractium.model.Comment;

public interface CommentRepository {
	
	List<Comment> findByProductId(Long productID);
	List<Comment> findByCommentDate(Date commentDate);
	List<Comment> findByUserId(Long userID);
	List<Comment> findByUserIdAndDate(Long userID, Date commentDate);
	List<Comment> findByColumnDateBetween(Date to, Date from);
	void deleteByProductId(Long productID);

}
