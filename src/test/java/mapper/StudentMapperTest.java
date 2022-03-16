package mapper;

import data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Project name(项目名称)：MyBatis一对多关联查询
 * Package(包名): mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/16
 * Time(创建时间)： 13:35
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */


class StudentMapperTest
{

    /**
     * Gets student information.
     *
     * @throws IOException the io exception
     */
    @Test
    void getStudentInformation() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentInformation(202012340101L);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Gets student information 1.
     *
     * @throws IOException the io exception
     */
    @Test
    void getStudentInformation1() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentInformation1(202012340101L);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Gets student information 2.
     *
     * @throws IOException the io exception
     */
    @Test
    void getStudentInformation2() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentInformation2(202012340101L);
        System.out.println(student);

        sqlSession.close();
    }

    /**
     * Gets student information by class no.
     *
     * @throws IOException the io exception
     */
    @Test
    void getStudentInformationByClassNo() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = studentMapper.getStudentInformationByClassNo(1001L);
        for (Student student : list)
        {
            System.out.println(student);
            System.out.println();
        }

        sqlSession.close();
    }
}