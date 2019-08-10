import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from '../NavBar.js';
import ComicList from '../components/comics/ComicList';
import PersonaList from '../components/personas/PersonaList';
import PublisherList from '../components/publishers/PublisherList';
import Request from '../helpers/request';


class MainContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      comics: [],
      personas: [],
      publishers: [],
      users: [],
      reviews: []
    }
  }


  componentDidMount(){
    const request = new Request()

    const promise1 = request.get('/api/comics');
    const promise2 = request.get('/api/characters');
    const promise3 = request.get('/api/publishers');

    const promises = [promise1, promise2, promise3];

    Promise.all(promises).then((data) => {
      console.log(data);
      this.setState({
        comics: data[0],
        personas: data[1],
        publishers: data[2]
      })
    })
  }


  render(){
    return (
    <div>
      <Router>
        <React.Fragment>

          <NavBar />

          <Switch>

            {/* Get all comics */}
            <Route exact path="/comics" render={(props) => {
              return <ComicList comics={this.state.comics}/>
            }} />

            {/* Get all characters */}
            <Route exact path="/characters" render={(props) => {
              return <PersonaList personas={this.state.personas}/>
            }} />

            {/* Get all publishers */}
            <Route exact path="/publishers" render={(props) => {
              return <PublisherList publishers={this.state.publishers}/>
            }} />

          </Switch>
        </React.Fragment>
      </Router>
    </div>
  )
  }

}

export default MainContainer;
