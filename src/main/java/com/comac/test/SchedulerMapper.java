package com.comac.test;

import java.util.List;

public interface SchedulerMapper {

    @Update("update cp_c_certificate_records_manage inner join (select v.cp_c_id,h.ID,h.ECODE,h.ENAME,h.admin_level" +
            "from cp_c_emp_post_hrorg v,cp_c_hrorg h" +
            "where v.join_type='1'" +
            "and join_id=h.ID)a on a.cp_c_emp_id=t.cp_c_emp_id" +
            "set t.cp_c_org_ecode=a.ECODE," +
            "t.cp_c_org_ename=a.ENAME" +
            "where a.ID =#{empId}")
    void updateUser3(@Param("empId")Long empId);

    @Update("update cp_c_certificate_records_manage inner join (select v.cp_c_id,h.ID,h.ECODE,h.ENAME,h.admin_level" +
            "from cp_c_emp_post_hrorg v,cp_c_hrorg h" +
            "where v.join_type='1'" +
            "and join_id=h.ID)a on a.cp_c_emp_id=t.cp_c_emp_id" +
            "set t.cp_c_org_ecode=a.ECODE," +
            "t.cp_c_org_ename=a.ENAME" +
            "where a.ID =#{empId} and t.cp_c_emp_id=#{id}")
    void updateUser(@Param("empId")Long empId,@Param("id")Long id);
    @Select("select distinct t.cp_c_emp_id,h.ID,h.ECODE,h.ENAME,t.cp_c_org_ecode,t.cp_c_org_ename,h.admin_level" +
            "from cp_c_training_records_manage t" +
            "left join cp_c_emp_post_hrorg v on v.cp_c_emp_id=t.cp_c_emp_id and v.join_type='1'" +
            "left join cp_c_hrorg h on v.join_id=h.ID" +
            "where v.is_main='Y' and h.admin_level <>''")
    List<User> queryAdminLevel();

    @Select("select distinct t.cp_c_emp_id,h.ID,h.ECODE,h.ENAME,t.cp_c_org_ecode,t.cp_c_org_ename,h.admin_level" +
            "from cp_c_training_records_manage t" +
            "left join cp_c_emp_post_hrorg v on v.cp_c_emp_id=t.cp_c_emp_id and v.join_type='1'" +
            "left join cp_c_hrorg h on v.join_id=h.ID" +
            "where v.is_main='Y' and t.cp_c_org_ecode <>'' and h.Id=#{id}")
    List<Admin> queryempById(@Param("id")Long id);

}
