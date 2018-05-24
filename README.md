# zac-spring-boot
springboot
doma
thymeleaf

# STSにプロジェクトをインポート
workspace直下にgit clone。リポジトリ：https://github.com/z1978/zac-spring-boot.git
git clone https://github.com/z1978/zac-spring-boot.git

# SampleDB
jdbc:mysql://localhost:3306/sample_db
user: test_user
pwd: hogehoge

# Domaの設定
(1)プロジェクト右クリ→Properties→Annotation Processingを選択肢、下図のようにチェック
	dao.subpackage	impl
	dao.suffix	Impl
	debug	false
	http://doma.seasar.org/reference/apt.html#Eclipse%E3%81%A7%E3%81%AE%E3%82%AA%E3%83%97%E3%82%B7%E3%83%A7%E3%83%B3%E6%8C%87%E5%AE%9A
(2)Factory Pathに/zac-spring-boot/document/lib/doma-2.19.0.jarをインポート

# Doma2のgenで自動生成を行う
doma-gen-build.xml
右クリック⇒Run As⇒Ant Build