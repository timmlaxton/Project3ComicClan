import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return(
    <header>

        <img src="/images/ComicClan_Logo_Adventure.png" alt="ComicClan Logo"/>

        <ul>
          <li className="navLink">
            <Link to="/comics">Comics</Link>
          </li>
        </ul>

    </header>
  )
}

export default NavBar;
