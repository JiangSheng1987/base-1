package org.forkjoin.apikit.old;

import java.util.List;
import java.util.Map;

/**
 * @author zuoge85 on 15/7/14.
 */
public interface ApiMessage {
    List<Map.Entry<String, Object>> encode(String parent,List<Map.Entry<String, Object>> $list);
    void decode(Map<String, Object> $map);
}
