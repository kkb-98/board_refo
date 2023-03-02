package com.bit.model;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.bit.framework.jdbc.JdbcTemplate;


public class BoardDao {
	String className="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/lecture";
	String user="scott";
	String password="tiger";
	
	JdbcTemplate template=new JdbcTemplate() {
		@Override
		public Object mapper(ResultSet rs) throws SQLException {
			BoardDto bean=new BoardDto();
			bean.setNum(rs.getInt("num"));
			bean.setUserId(rs.getString("userId"));
			bean.setSub(rs.getString("sub"));
			bean.setContent(rs.getString("content"));
			bean.setNalja(rs.getDate("nalja"));
			return bean;
		}
	};
	private DataSource getDataSource(){
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL(url);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	public List<BoardDto> selectAll(){
		String sql="select * from bbs02 order by num desc";
		template.setDataSource(getDataSource());
		return template.queryForAll(sql,new Object[] {});
	}
	
	
	public BoardDto selectOne(int num) {
		String sql = "select * from bbs02 where num=?";
		template.setDataSource(getDataSource());
		return (BoardDto) template.queryForAll(sql, new Object[] { num }).get(0);
	}
	
	public int insertOne(String userId, String sub,String content) {
		String sql = "insert into bbs02 (userId,sub,content,nalja) values (?,?,?,now())";
		template.setDataSource(getDataSource());
		return template.update(sql, new Object[] { userId, sub, content });
	}

	public int updateOne(int num, String sub,String content) {
		String sql = "update bbs02 set sub=?, content=? where num=?";
		template.setDataSource(getDataSource());
		Object[] objs = { sub, content, num };
		return template.update(sql, objs);
	}
	
	public int deleteOne(int num) {
		String sql = "delete from bbs02 where num=?";
		template.setDataSource(getDataSource());
		Object[] objs = { num };
		return template.update(sql, objs);
	}
	
	public Object setRs(ResultSet rs) throws SQLException {
		BoardDto bean=new BoardDto();
		bean.setNum(rs.getInt("num"));
		bean.setUserId(rs.getString("userId"));
		bean.setSub(rs.getString("sub"));
		bean.setContent(rs.getString("content"));
		bean.setNalja(rs.getDate("nalja"));
		return bean;
	}
}
