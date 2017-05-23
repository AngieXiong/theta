package com.theta.framework.redis;

public class JedisUtil {
	// jedis
	private static JedisFactory jedisFactory = JedisFactory.getInstance();

	/** set Object */
	public static void set(String key, Object object) {
		jedisFactory.getJedis().set(key.getBytes(), SerializeUtil.serialize(object));

	}
	
	/**
	 * @date 2017年1月14日上午11:11:58
	 * @param key
	 * @param object
	 * @param seconds void
	 * @Des:带过期时间的保存
	 */
	public static void setExpire(String key, Object object,int seconds) {
		jedisFactory.getJedis().setExpire(key.getBytes(), SerializeUtil.serialize(object),seconds);
		
	}
	
	

	/** get Object */
	public static Object get(String key) {
		byte[] value = jedisFactory.getJedis().get(key.getBytes());
//		System.err.println("value.length:"+value.length);
//		for (int i = 0; i < value.length; i++) {
//			System.err.println("value"+i+":"+value[i]);
//			
//		}
		return SerializeUtil.unserialize(value);

	}

	/** delete a key **/
	public static void del(String key) {
		jedisFactory.getJedis().del(key.getBytes());
	}
}
