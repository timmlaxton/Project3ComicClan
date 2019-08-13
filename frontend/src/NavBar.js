import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return(
    <header>

    <div className="topnav">
        <Link to="/">
        <img src="/images/LogoMakr_9LfrtG.png" alt="Comic Logo"/>
        <img src="/images/ComicClan_Logo_Adventure.png" alt="ComicClan Logo"/>
        <img src="/images/LogoMakr_9LfrtG.png" alt="Comic Logo2"/>
        </Link>
    </div>

    <div className="navLinks">
        <ul>
          <li>
            <Link to="/comics">Comics</Link>
          </li>
          <li>
            <Link to="/characters">Characters</Link>
          </li>
          <li>
            <Link to="/publishers">Publishers</Link>
          </li>
        </ul>
      </div>

    </header>
  )
}

export default NavBar;
