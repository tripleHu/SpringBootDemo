package app.repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import app.domain.BaseInfo;

@Repository
public interface InfoRepositoty extends JpaRepository<BaseInfo, Long> {

	/*
	 * 根据info查询
	 */
	@Modifying
	@Query("select b from BaseInfo b where b.info = :info")
	public List<BaseInfo> getByInfo(@Param("info") String info);
}
