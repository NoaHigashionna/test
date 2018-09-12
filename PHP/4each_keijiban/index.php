<!DOCTYPE html>
<html lang="ja">
   <head>
      <meta charset="UTF-8">
      <title>4eachblog掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
   </head>
    <body>
        <?php mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=lesson_noa;host=localhost;","root","mysql");
        $stmt = $pdo -> query("select * from 4each_keijiban");
        ?>
    
       <header>
        <div><img src="4eachblog_logo.jpg"></div>
        <div class="menu">
            <ul>
            <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>
        </div>
       </header>
        <main>
        <div class="left-container">
           <h1>プログラミングに役立つ掲示板</h1>
        </div>
            <form method="post" action="insert.php" class="box">
                <h2>入力フォーム</h2>
                <p>ハンドルネーム<br><input type="text" name="handlename"/></p>
                <p>タイトル<br><input type="text" name="title"/></p>
                <p>コメント<br><textarea name="comments"></textarea></p>           
                <p><input type="submit" value="投稿する" class="button"/></p>
            </form>
        <?php
            while($row = $stmt->fetch()){
            echo "<div class='kbox'>";
            echo "<h4>".$row['title']."</h4>";
            echo "<p>".$row['comments']."</p>";
            echo "<p>prodyced by ".$row['handlename']."</p>";
            echo "</div>";
            }
        ?>
        <div class="right-container">                
            <h3>人気の記事</h3>
                <ul>
                    <li>PHPオススメ本</li>
                    <li>PHP　MyAdminの使い方</li>
                    <li>今人気のエディタTop5</li>
                    <li>HTMLの基礎</li>
                </ul>
            <h3>オススメリンク</h3>
                <ul>
                    <li>インターノウス株式会社</li>
                    <li>XAMPPのダウンロード</li>
                    <li>Eclipsのダウンロード</li>
                    <li>Bracketsのダウンロード</li>
                </ul>
            <h3>カテゴリ</h3>
                <ul>
                    <li>HTML</li>
                    <li>PHP</li>
                    <li>MySQL</li>
                    <li>JavaScript</li>
                </ul>
        </div>
       </main>
        
       <footer>
       copyright © internous | 4each blog is the one which provides A to Z about programing.
        </footer>
    </body>
</html>