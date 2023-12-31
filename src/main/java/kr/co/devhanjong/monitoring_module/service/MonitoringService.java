package kr.co.devhanjong.monitoring_module.service;

import kr.co.devhanjong.monitoring_module.dto.MonitoringDto;

import java.util.List;

public interface MonitoringService {

    /*******************************************************************************************
     * 에러 히스토리 조회 - 전체
     *******************************************************************************************/
    List<MonitoringDto.Select> fetchAllExceptionHistory();

    /*******************************************************************************************
     * 에러 히스토리 조회 - 검색
     *******************************************************************************************/
    List<MonitoringDto.Select> fetchExceptionHistoryBySearch(MonitoringDto.Select dto);

    /*******************************************************************************************
     * 에러 히스토리 조회 - 알람 미발송
     *******************************************************************************************/
    List<MonitoringDto.Select> fetchAllExceptionHistoryAlarmNotSent();

    /*******************************************************************************************
     * 에러 등록
     *******************************************************************************************/
    void insertExceptionHistory(MonitoringDto.Insert dto);

    /*******************************************************************************************
     * 에러 갱신 - 알람 발송
     *******************************************************************************************/
    void updateExceptionHistoryByAlarmSent(long idx);

    /*******************************************************************************************
     * INDEX 생성
     *******************************************************************************************/
    void createIndex();

    /*******************************************************************************************
     * INDEX 삭
     *******************************************************************************************/
    void dropIndex();

}
