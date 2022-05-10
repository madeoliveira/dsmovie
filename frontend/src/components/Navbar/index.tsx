import { ReactComponent as GithubIcom } from 'assets/img/github.svg';
import'./styles.css';
function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-cantent">
          <h1> DSMovie</h1>
          <a href="https://github.com/madeoliveira">
            <div className='dsmovie-contact-conteiner'>
              <GithubIcom />
              <p className='dsmovie-contact-link'>/madeoliveira</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}
export default Navbar