package mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Project name(项目名称)：MyBatis一对一关联查询
 * Package(包名): mapper
 * Interface(接口名): StudentMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/15
 * Time(创建时间)： 22:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public interface StudentMapper
{
    /**
     * Gets student information.
     * 多步查询
     *
     * @param student_no the student no
     * @return the student information
     */
    public data.Student getStudentInformation(@Param("student_no") Long student_no);

    /**
     * Gets student information 1.
     * 单步查询
     *
     * @param student_no the student no
     * @return the student information 1
     */
    public data.Student getStudentInformation1(@Param("student_no") Long student_no);

    /**
     * Gets student information 2.
     * 班级信息为空
     *
     * @param student_no the student no
     * @return the student information 2
     */
    public data.Student getStudentInformation2(@Param("student_no") Long student_no);

    /**
     * Gets student information by class no.
     *
     * @param class_no the class no
     * @return the student information by class no
     */
    public List<data.Student> getStudentInformationByClassNo(@Param("class_no") Long class_no);

    /**
     * Gets student information 3.
     * 多对多查询
     *
     * @param student_no the student no
     * @return the student information 3
     */
    public data.Student getStudentInformation3(@Param("student_no") Long student_no);
}
