package com.example.cloudstreamsample.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@StreamListener(Sink.INPUT)
	public void handle(String hoge) {

		log.info(hoge);

		if (0 > 1) {
			throw new RuntimeException();
		}

		// kill -9 テスト用コード
//		try {
//			Thread.sleep(1000 * 60);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		// このメソッドブロックから抜けるまでは、Kafkaの読み取り位置のチェックポイントが更新されないが、個別のメッセージ毎にチェックポイントが記録されているかは不明。
	}
}
