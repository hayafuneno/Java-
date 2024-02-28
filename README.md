# はじめに
本プロジェクトは、早船のJava学習管理用です。
下記に各種ルールを記載します。

# 学習内容
Paizaラーニング や SYSTEM PACK LMSの『JAVAに馴染もう』で学習し、ソースコードを記載する。

# 各種ルール（命名規約）
 

## ⑴ファイル作成ルール

ファイル作成のルールとして、Program_Anser / src の配下にフォルダを作成した該当する学習区分に関するソースコードを該当するフォルダに格納する。


■ **001-『Paizaラーニング』に関するコードの場合** 

Program_Anser / src 配下の「001_Paizaラーニング」フォルダに格納する。

※作成するクラス名をPaizaの問題番号と同じように命名して、問題を紐づけしてわかりやすいようにする。

> （例）　Paizaの問題（タイトル）「D084:英語で何月？」の場合、
>    	
> 　　　　public class D084 {
> 
> 　　　　　　★★⇖クラス名にはPaizaの問題番号が入る★★

■ **002-『JAVAに馴染もう』に関するコードの場合** 

Program_Anser / src 配下の「002_JAVAに馴染もう」フォルダに格納する。
	
■ **003-『Java8問題集』に関するコードの場合**

Program_Anser / src 配下の「003_Java8問題集」フォルダに格納する。
    
■ **099-その他のコードの場合**

Program_Anser / src 配下の「099_その他」フォルダに格納する。
	

## ⑵コミットルール
**学習区分_学習内容【ステータス】**の順番で記載を行う。
※学習区分と学習内容の間は、アンダースコアで繋げ、ステータスは【】で囲う。

**コミットの型※①学習区分_②学習内容③【ステータス】**
**①_②【③】** 
> （例）
> 　001_D084:英語で何月？【質問】
> 　002_配列について【提出済み】
> 　099_YouTube戻り値問題【作成中】

   ## ①学習区分
 学習区分コードは、下記の4つから選択してコミットする。
    
| 学習区分 | 学習名 |
|--|--|
|**001**| **Paizaラーニング** |
|**002**| **SYSTEM PACK LMSの『JAVAに馴染もう』（動画）** |
|**003**| **『Java8問題集』** |
|**099**| **その他のJava学習サイトやJavaに関する勉強**|

 ## ②学習内容
 学習した内容がすぐに分かるようなタイトルをつけてコミットする。
 
	

> （例） 	
> 　001_D084:英語で何月？【質問】

    
 ## ③ステータス
 | ステータス名 |内容|
|---|---|
|【質問】|質問したい内容があるときの表示
|【作成中】|現在ソースコード作成中の表示
|【提出済み】|ソースコード作成完了の表示

※　ステータスは【　　】で表示する。
    
# 参考資料

・Paizaラーニング
	https://paiza.jp/works/courses
	
・JAVAに馴染もう
	https://edu.system-pack.co.jp/e-learning/
