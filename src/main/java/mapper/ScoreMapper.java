package mapper;

import java.util.List;

/**
 * Project name(项目名称)：MyBatis多对多关联查询
 * Package(包名): mapper
 * Interface(接口名): ScoreMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/16
 * Time(创建时间)： 21:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface ScoreMapper
{
    public List<data.Score> getScores();
}
