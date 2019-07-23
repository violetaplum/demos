package customerProcess;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import customerProcess.CustomerVO;

public class CustomerDAO
{
    private ArrayList<Object> alist1;
    private JdbcTemplate jt1;//////////spring자체의 디비 class!!

    public JdbcTemplate getJdbcTemplate() {
        return jt1;
    }

    public void setJdbcTemplate(JdbcTemplate jt1) {
        this.jt1 = jt1;
    }

    public ArrayList<Object> selectAll()  //모두 출력 메소드
    {
        StringBuffer sb1 = new StringBuffer();//문자열의 변화가 많을때
        sb1.append("select * from producttbl");//jt1.query(select문자열,new RowMapper(){메소드})

        //string을 수행하여 resultset에 넣은다음 객체로 꺼내서 arraylist로 넣는 메소드
        alist1 = (ArrayList<Object>) getJdbcTemplate().query
                ( //query : 조회명령어
                        sb1.toString(), new RowMapper<Object>()
                        {

                            public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException
                            {
                                CustomerVO cv1 = new CustomerVO();
                                System.out.println("줄번호 = " + joolBun1);
                                cv1.setCId(rs1.getInt("cid"));
                                cv1.setCName(rs1.getString("cname")); //rs1에서 읽어 VO로
                                cv1.setPName(rs1.getString("pname"));
                                return cv1;
                            }//mapRow()-end
                        }
                );// new RowMapper()-end //query-end
        System.out.println("자료 총 갯수는 " + kajaSoo());
        return alist1;
    }//selectAll()-end
    //만일 rowmapper is not generic error

    public int kajaSoo() {
        //select의 결과가 1개만 나오면 그냥 queryForObject()만 써도 된다.
        //상단의query()와 같은 동작을 하는놈
        int soo = jt1.queryForObject("select count(cid) from producttbl", Integer.class);
        //결과가 one row
        return soo;
    }

}
