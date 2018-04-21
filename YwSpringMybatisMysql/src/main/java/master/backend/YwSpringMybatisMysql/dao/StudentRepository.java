package master.backend.YwSpringMybatisMysql.dao;

import master.backend.YwSpringMybatisMysql.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private SqlSession sqlSession;

    @Autowired
    public StudentRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Student findStudentByName(String name) {
        return sqlSession.selectOne("database.getStudentByName", name);
    }

}
