package org.hengsir.icma.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.hengsir.icma.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hengsir
 * @date 2018/1/5 下午2:57
 */
@Component
public interface PersonMapper {

    /**
     * 根据条件查询所有person
     *
     * @param person
     * @return
     */
    public List<Person> findAll(Person person);

    /**
     * 修改一个person
     *
     * @param person
     * @return
     */
    public int update(Person person);

    /**
     * 创建一个person
     *
     * @param person
     * @return
     */
    public int create(Person person);

    /**
     * 删除一个person
     *
     * @param personId
     * @return
     */
    public int delete(@Param("personId") String personId);

    Person findByUserId(@Param("userId") int userId);

    Person findById(@Param("personId") String personId);

    void sensitize(@Param("personId") String personId);
}
