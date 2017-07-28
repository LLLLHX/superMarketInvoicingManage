package com.invoicing.manage.service;

import com.invoicing.manage.entity.SystemUserEntity;
import java.util.Map;
import java.util.List;
import com.snailf.platforms.common.entity.PageInfo;
/**
 *
 * @time 2017年07月27日 20:19:33
 * @version 1.0
 *
 **/

public interface SystemUserService  {
  	/**
	 * 通过主键id 删除
	 * @param id
	 * @return
	 */
	int deleteSystemUser(Long id);
	/**
	 * 插入实体
	 * @param record
	 * @return
	 */
	int insertSystemUser(SystemUserEntity record);
	/**
	 * 通过主键id 获取实体对象
	 * @param id
	 * @return
	 */
	SystemUserEntity getSystemUser(Long id);
	/**
	 * 通过主键id 更新实体
	 * @param record
	 * @return 1成功  其它失败
	 */
	int updateSystemUser(SystemUserEntity record);
	/**
	 * 通过map参数获取列表
	 * @param params
	 * @return List<SystemUserEntity>
	 */
	List<SystemUserEntity> getSystemUserList(Map<String,Object> params);
	/**
	 * 通过map参数获取列表 分页
	 * @param params
	 * @return PageInfo<SystemUserEntity>
	 */
	PageInfo<SystemUserEntity> getSystemUserPageList(PageInfo<SystemUserEntity> pageInfo,Map<String,Object> params);

}