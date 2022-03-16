package data;

import java.util.List;

/**
 * Project name(项目名称)：MyBatis一对一关联查询
 * Package(包名): data
 * Class(类名): Class
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/15
 * Time(创建时间)： 22:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Class
{
    //班级编号
    private Long class_no;
    //班级名称
    private String class_name;
    //所属学院
    private String class_college;
    //所属专业
    private String class_major;
    //入学年份
    private Integer class_enrollment_year;
    //学生列表
    private List<Student> studentList;

    /**
     * 无参构造
     */
    public Class()
    {
    }

    /**
     * 全参构造
     *
     * @param class_no              班级编号
     * @param class_name            班级名称
     * @param class_college         所属学院
     * @param class_major           所属专业
     * @param class_enrollment_year 入学年份
     * @param studentList           the student list
     */
    public Class(Long class_no, String class_name, String class_college, String class_major,
                 Integer class_enrollment_year, List<Student> studentList)
    {
        this.class_no = class_no;
        this.class_name = class_name;
        this.class_college = class_college;
        this.class_major = class_major;
        this.class_enrollment_year = class_enrollment_year;
        this.studentList = studentList;
    }
    //对应的getter方法和setter方法


    /**
     * Gets class no.
     *
     * @return the class no
     */
    public Long getClass_no()
    {
        return class_no;
    }

    /**
     * Sets class no.
     *
     * @param class_no the class no
     */
    public void setClass_no(Long class_no)
    {
        this.class_no = class_no;
    }

    /**
     * Gets class name.
     *
     * @return the class name
     */
    public String getClass_name()
    {
        return class_name;
    }

    /**
     * Sets class name.
     *
     * @param class_name the class name
     */
    public void setClass_name(String class_name)
    {
        this.class_name = class_name;
    }

    /**
     * Gets class college.
     *
     * @return the class college
     */
    public String getClass_college()
    {
        return class_college;
    }

    /**
     * Sets class college.
     *
     * @param class_college the class college
     */
    public void setClass_college(String class_college)
    {
        this.class_college = class_college;
    }

    /**
     * Gets class major.
     *
     * @return the class major
     */
    public String getClass_major()
    {
        return class_major;
    }

    /**
     * Sets class major.
     *
     * @param class_major the class major
     */
    public void setClass_major(String class_major)
    {
        this.class_major = class_major;
    }

    /**
     * Gets class enrollment year.
     *
     * @return the class enrollment year
     */
    public Integer getClass_enrollment_year()
    {
        return class_enrollment_year;
    }

    /**
     * Sets class enrollment year.
     *
     * @param class_enrollment_year the class enrollment year
     */
    public void setClass_enrollment_year(Integer class_enrollment_year)
    {
        if (class_enrollment_year >= 0)
        {
            this.class_enrollment_year = class_enrollment_year;
        }
        else
        {
            this.class_enrollment_year = 0;
        }
    }

    /**
     * Gets student list.
     *
     * @return the student list
     */
    public List<Student> getStudentList()
    {
        return studentList;
    }

    /**
     * Sets student list.
     *
     * @param studentList the student list
     */
    public void setStudentList(List<Student> studentList)
    {
        this.studentList = studentList;
    }

    /**
     * toString方法
     *
     * @return 字符串
     */
    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("class_no：").append(class_no).append('\n');
        stringbuilder.append("class_name：").append(class_name).append('\n');
        stringbuilder.append("class_college：").append(class_college).append('\n');
        stringbuilder.append("class_major：").append(class_major).append('\n');
        stringbuilder.append("class_enrollment_year：").append(class_enrollment_year).append('\n');
        stringbuilder.append("studentList：").append(studentList).append('\n');
        return stringbuilder.toString();
    }
}
