package com.chevrolet.core.task;

/**
 * @author maihe
 */
public interface AssetRightAutoDiscardTask {
    //超过24小时完成或取消的变更单，自动废弃
    /**
     * 变更单废弃
     * 1.物权变更单状态【已废弃】
     * 2.车辆物权还原
     */
    void autoDiscard();
}
