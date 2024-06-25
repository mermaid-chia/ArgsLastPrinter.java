
public class ArgsLastPrinter {
	public static void main(String[] args) {

		// 1. 引数argsの要素数を数える java
		// 2. 要素数が0個かどうか？を確認する
		// 3. 要素数が0個だったらメッセージ表示して終了
		// 4. 要素数が1個以上だったら最後の要素を表示する

		// hairetu yousosuuuwokazoerus
		if (args.length == 0) {
			System.out.println("なし");
		} else {
			System.out.println(args[args.length - 1]);
		}
	}
}
