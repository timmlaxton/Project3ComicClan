import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return(
    <header>

        <Link to="/">
        <img src="/images/ComicClan_Logo_Adventure.png" alt="ComicClan Logo"/>
        </Link>

        <ul>
          <li className="navLink">
            <Link to="/comics">Comics</Link>
          </li>
          <li className="navLink">
            <Link to="characters">Characters</Link>
          </li>
          <li>
            <Link to="publishers">Publishers</Link>
          </li>
        </ul>

    </header>
  )
}

export default NavBar;
