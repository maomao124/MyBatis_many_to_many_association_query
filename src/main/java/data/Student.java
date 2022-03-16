package data;


import java.util.List;

/**
 * Project name(项目名称)：MyBatis一对一关联查询
 * Package(包名): data
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/15
 * Time(创建时间)： 22:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Student
{
    //学号
    private Long student_no;
    //学生姓名
    private String name;
    //学生性别
    private String sex;
    //电话号码
    private String telephone_number;
    //家庭电话号码，或者紧急联系人
    private String family_telephone_number;
    //生日
    private String birthday;
    //家庭地址
    private String address;
    //身份证号
    private String id_card;
    //电子邮箱
    private String email;
    //寝室号
    private String dormitory_number;
    //所属班级
    private Class c;
    //所属班级编号
    private Long class_no;
    //状态，在读、毕业或者退学
    private String state;
    //备注
    private String remarks;
    //学生选修的课程
    private List<Course> courseList;

    /**
     * 无参构造
     */
    public Student()
    {

    }

    /**
     * Instantiates a new Student.
     *
     * @param student_no              the student no
     * @param name                    the name
     * @param sex                     the sex
     * @param telephone_number        the telephone number
     * @param family_telephone_number the family telephone number
     * @param birthday                the birthday
     * @param address                 the address
     * @param id_card                 the id card
     * @param email                   the email
     * @param dormitory_number        the dormitory number
     * @param c                       the c
     * @param class_no                the class no
     * @param state                   the state
     * @param remarks                 the remarks
     */
    public Student(Long student_no, String name, String sex, String telephone_number,
                   String family_telephone_number, String birthday, String address,
                   String id_card, String email, String dormitory_number, Class c,
                   Long class_no, String state, String remarks,List<Course> courseList)
    {
        this.student_no = student_no;
        this.name = name;
        this.sex = sex;
        this.telephone_number = telephone_number;
        this.family_telephone_number = family_telephone_number;
        this.birthday = birthday;
        this.address = address;
        this.id_card = id_card;
        this.email = email;
        this.dormitory_number = dormitory_number;
        this.c = c;
        this.class_no = class_no;
        this.state = state;
        this.remarks = remarks;
        this.courseList=courseList;
    }
    //对应的getter方法和setter方法

    /**
     * Gets student no.
     *
     * @return the student no
     */
    public long getStudent_no()
    {
        return student_no;
    }

    /**
     * Sets student no.
     *
     * @param student_no the student no
     */
    public void setStudent_no(Long student_no)
    {
        if (student_no <= 0)
        {
            this.student_no = 0L;
        }
        else
        {
            this.student_no = student_no;
        }
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /**
     * Gets telephone number.
     *
     * @return the telephone number
     */
    public String getTelephone_number()
    {
        return telephone_number;
    }

    /**
     * Sets telephone number.
     *
     * @param telephone_number the telephone number
     */
    public void setTelephone_number(String telephone_number)
    {
        this.telephone_number = telephone_number;
    }

    /**
     * Gets family telephone number.
     *
     * @return the family telephone number
     */
    public String getFamily_telephone_number()
    {
        return family_telephone_number;
    }

    /**
     * Sets family telephone number.
     *
     * @param family_telephone_number the family telephone number
     */
    public void setFamily_telephone_number(String family_telephone_number)
    {
        this.family_telephone_number = family_telephone_number;
    }

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday()
    {
        return birthday;
    }

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Gets id card.
     *
     * @return the id card
     */
    public String getId_card()
    {
        return id_card;
    }

    /**
     * Sets id card.
     *
     * @param id_card the id card
     */
    public void setId_card(String id_card)
    {
        this.id_card = id_card;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Gets dormitory number.
     *
     * @return the dormitory number
     */
    public String getDormitory_number()
    {
        return dormitory_number;
    }

    /**
     * Sets dormitory number.
     *
     * @param dormitory_number the dormitory number
     */
    public void setDormitory_number(String dormitory_number)
    {
        this.dormitory_number = dormitory_number;
    }

    /**
     * Gets c.
     *
     * @return the c
     */
    public Class getC()
    {
        return c;
    }

    /**
     * Sets c.
     *
     * @param c the c
     */
    public void setC(Class c)
    {
        this.c = c;
    }

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
     * Gets state.
     *
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks()
    {
        return remarks;
    }

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    /**
     * Gets course list.
     *
     * @return the course list
     */
    public List<Course> getCourseList()
    {
        return courseList;
    }

    /**
     * Sets course list.
     *
     * @param courseList the course list
     */
    public void setCourseList(List<Course> courseList)
    {
        this.courseList = courseList;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("student_no：").append(student_no).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        stringbuilder.append("telephone_number：").append(telephone_number).append('\n');
        stringbuilder.append("family_telephone_number：").append(family_telephone_number).append('\n');
        stringbuilder.append("birthday：").append(birthday).append('\n');
        stringbuilder.append("address：").append(address).append('\n');
        stringbuilder.append("id_card：").append(id_card).append('\n');
        stringbuilder.append("email：").append(email).append('\n');
        stringbuilder.append("dormitory_number：").append(dormitory_number).append('\n');
        stringbuilder.append("c：").append(c).append('\n');
        stringbuilder.append("class_no：").append(class_no).append('\n');
        stringbuilder.append("state：").append(state).append('\n');
        stringbuilder.append("remarks：").append(remarks).append('\n');
        stringbuilder.append("courseList：").append(courseList).append('\n');
        return stringbuilder.toString();
    }
}
