package com.mysystem.service;

import java.util.List;

import com.mysystem.domain.User;
import com.mysystem.domain.UserExtend;

public interface IUserService {
	/**
	 * 分页
	 * 
	 * @param pageNO
	 * @param size
	 * @return
	 */
	public List<UserExtend> queryUserPager(int pageNO, int size);

	/**
	 * 查询用户总数
	 * 
	 * @return
	 */
	public int queryUserCount();

	/**
	 * 根据用户id查询用户
	 * 
	 * @param userid
	 * @return
	 */
	public User queryUserById(int userid);

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

	/**
	 * 根据用户id删除用户
	 * 
	 * @param user_id
	 * @return
	 */
	public int deleteUserById(int user_id);

	/**
	 * 删除多个用户
	 * 
	 * @param userIds
	 * @return
	 */
	public int deleteUsers(int[] userIds);
}
