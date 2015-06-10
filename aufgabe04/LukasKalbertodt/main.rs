
use std::env::args;

fn main() {
    let args = args().collect::<Vec<_>>();
    let bonus : f64 = args[1].parse().unwrap();
    let price : f64 = args[2].parse().unwrap();

    let mut n = (bonus / price) as isize;

    let mut i = 1;
    loop {
        let e = i*i;
        if e <= n {
            i += 1;
            n -= e;
        } else {
            break;
        }
    }
    println!("{}", i - 1);
}
