class Fibno implements Runnable {
	int n, p;
	Thread t;

	Fibno(int n) {
		this.n = n;
		t = new Thread(this, "fibanocci_series");
		t.setPriority(3);
		System.out.println("The Priority of thread - " + t.getName() + " : " + t.getPriority());
		t.start();
	}

	public void run() {
		int f1 = 0, f2 = 1, f3;
		if (n > 3) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + f1);
				System.out.println(Thread.currentThread().getName() + " : " + f2);
				for (int i = 3; i <= n; i++) {
					f3 = f1 + f2;
					System.out.println(Thread.currentThread().getName() + " : " + f3);
					f1 = f2;
					f2 = f3;
					Thread.sleep(500);
					System.out.println();
				}
			} catch (InterruptedException q) {
			}
		} else
			System.out.println("Sorry can't print the series");
	}
}

class Even implements Runnable {
	int s, e;
	Thread a;

	Even(int s, int e) {
		this.s = s;
		this.e = e;
		a = new Thread(this, "even_numbers");
		a.setPriority(10);
		System.out.println("The Priority of thread - " + a.getName() + " : " + a.getPriority());

		a.start();
	}

	public void run() {
		try {
			for (int i = s; i <= e; i++) {
				if (i % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
					Thread.sleep(1000);
					System.out.println();
				}
			}
		} catch (InterruptedException q) {
		}

	}
}

class ThreadMain {
	public static void main(String args[]) {
		int num = 8, s = 3, e = 18;
		System.out.println("The normal priority of thread : " + Thread.NORM_PRIORITY + "\n");
		new Fibno(num);
		new Even(s, e);
	}
}
