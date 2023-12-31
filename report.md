
# クラスとオブジェクト、インスタンスの違い

- クラスとは
  - オブジェクトを具体的に使用する為に状態や性質、機能、処理、データなどをまとめた設計図。
  オブジェクトのひな形として役割を果たす。
  
- オブジェクトとは
  - コンピュータ上で操作や処理の対象になる実体。
  クラスでは様々なフィールドやメソッドを持っており、それらをひとまとめにし、一つの型としてとらえれたもの。
  クラスやインスタンスもオブジェクトに含まれている。

- インスタンスとは
  - クラス元に作成したオブジェクトの実体(具現化)で実際に属性や機能を使うことができるように実体化したもの。

- まとめ
  - オブジェクトはすべての総称。クラスもインスタンスもオブジェクトに含まれる。
  クラスは設計図で
  インスタンスはクラスから生まれた実体

# クラスの継承

- クラスの継承とは
  - 親クラスを元に子クラスを作成することで共通処理を引き継ぎながらも子クラス独自の処理を記述するための機能のこと。
  継続元のクラスのことを基盤クラス、スーパークラス、親クラスなどと呼ぶ。
  親クラスを継承したクラスのことを派生クラス、サブクラス、子クラスなどと呼ぶ。

- 継承のメリット
  - 同じ継承元のクラスを、まとめて扱うことができる。
  - コードの再利用性や拡張性が高まり、コーティング作業効率が向上する。

- 継承の注意点
  - 複数のクラスを同時に継承できない。
    final修飾子がついたクラスは継承できない。
    private修飾子はサブクラスから利用できない
    コンストラクタは継承されない
    多重継承(複数の親クラスの機能を１つの子クラスが１度に受け継ぐこと)はできない

# interface

- インターフェイスとは
  - クラスがどのようなメソッドを持っているかをあらかじめ定義する、いわば設計書のような存在。
  クラスとは異なり、具体的な処理内容は記述せず、メソッドの引数や戻り値だけ定義する。

- インターフェイスを利用するメリット
  - ポリモーフィズム(多様性)を実現できる。
  ポリモーフィズムは、複数のオブジェクトが同じ命令に対して違う挙式を行うことを可能にする。

  - 実装漏れを防げる
  インターフェイスをうまく活用することで、大規模開発の際に実行漏れを防げる。
  インターフェイスは、そのインターフェイス内で定義したメソッドの実装を保証する。あらかじめ必要なメソッドをインターフェイスに定義しておけば、実装漏れによるバグの発生を防げる。
  - 予め規格を決めておけばそに通りに作成することができ、保守性があがり複数人での開発の際に実装が複雑化せずに済む。
  - 改修が発生した場合でも追加で改修を実装するだけで、大元の呼び出しクラスへの影響を抑えられる効果もありテストの工数を短縮することが可能

# 引用

[オブジェクトとインスタンスって何が違うの？という初心者プログラマー向けの図解]
<https://nakazawakan.com/object-instance/>

[インスタンスとオブジェクトの違い-ITをわかりやすく解説]
<https://medium-company.com/%e3%82%a4%e3%83%b3%e3%82%b9%e3%82%bf%e3%83%b3%e3%82%b9-%e3%82%aa%e3%83%96%e3%82%b8%e3%82%a7%e3%82%af%e3%83%88-%e9%81%95%e3%81%84/>

[[Java] オブジェクト、クラス、インスタンスの違い]
<https://androidkoko.com/java/obj.html>

[【Java】継承が与えるメリットや継承方法、注意すべき点を紹介！]
<https://workteria.forward-soft.co.jp/blog/detail/10110>

[オブジェクト指向「継承」とは？わかりやすく解説してみた]
<https://www.sejuku.net/blog/9598#index_id3>

[【超初心者向け】Javaの継承について徹底解説]
<https://blog.codecamp.jp/java-inheritance>

[【図解で理解】Javaのinterfaceのメリットと使い方について]
<https://qiita.com/jin007/items/b4dc391a2e83eb999669>

[Javaのinterfaceとは？インターフェースの使い方やabstractクラスとの違い
]
<https://camp.trainocate.co.jp/magazine/java-interface-abstract/>
