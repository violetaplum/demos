package helloProcess3;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SawonDAO
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
        sb1.append("select name,tel from TelTable5");//jt1.query(select문자열,new RowMapper(){메소드})

        //string을 수행하여 resultset에 넣은다음 객체로 꺼내서 arraylist로 넣는 메소드
        alist1 = (ArrayList<Object>) getJdbcTemplate().query
                ( //query : 조회명령어
                    sb1.toString(), new RowMapper<Object>()
                    {
                        public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException
                        {
                                SawonVO sv1 = new SawonVO();
                                System.out.println("줄번호 = " + joolBun1);
                                sv1.setName(rs1.getString("name")); //rs1에서 읽어 VO로
                                sv1.setTel(rs1.getString("tel"));

                                 return sv1;
                        }//mapRow()-end
                    }
                );// new RowMapper()-end //query-end
        System.out.println("자료 총 갯수는 " + kajaSoo());
        return alist1;
    }//selectAll()-end
    //만일 rowmapper is not generic error




    public void update1()
    {
        jt1.update("update teltable5 set tel=? where name=?",new Object[]{"010-2225-1232","choi"});//직접 넣는 방식
        //원래는 PreparedStatement쓰고 난리쳐야했었지만
        //그럴 필요없어짐
    }
    public void update1(SawonVO sv1)
    {
        jt1.update("update teltable5 set tel=? where name=?",new Object[]{sv1.getTel(),sv1.getName()});
    }
    public void insert1(SawonVO sv1)
    {
        jt1.update("insert into teltable5 values(?,?,?,?)",new Object[]{sv1.getId(),sv1.getName(),sv1.getTel(),sv1.getDate()});
    }
    public void delete1(SawonVO sv1)
    {
        jt1.update("delete from teltable5 where name=?",new Object[]{sv1.getName()});
    }

    public void update1(String name, String tel)
    {
        jt1.update("update teltable5 set tel=? where name=?",new Object[]{tel,name});
    }

    public void insert1(String id,String name,String tel,Date d)
    {
        jt1.update("insert into teltable5 values(?,?,?,?)",new Object[]{id,name,tel,d});
    }
    public void delete1(String name)
    {
        jt1.update("delete from teltable5 where name=?",new Object[]{name});
    }




    public int kajaSoo() {
        //select의 결과가 1개만 나오면 그냥 queryForObject()만 써도 된다.
        //상단의query()와 같은 동작을 하는놈
        int soo = jt1.queryForObject("select count(name) from TelTable5", Integer.class);
        //결과가 one row
        return soo;
    }

}
